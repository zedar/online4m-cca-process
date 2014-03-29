package gui

import pl.bpm4cloud.handler.InputHandler
import pl.bpm4cloud.handler.OnClickHandler

class FRM_CCAHandler extends InputHandler {
  void onInit() {
    if (!processStep) {
      STATUS.setVisible(false) 
    }
    if (processStep) {
      NAME.setReadOnly(true)
      EMAIL.setReadOnly(true)
      MOBILE.setReadOnly(true)
      CARD_TYPE.setReadOnly(true)
      DISCLOSURE.setReadOnly(true)
    }
    if (processStep && processStep.startsWith("END_")) {
      STATUS.setReadOnly(true)
      SUBMIT.setVisible(false)
    }
  }
}

class NAMEHandler extends InputHandler {
  void onValidate() {
    if (!self.getValue()) {
      self.setRequiredValidation("Name is required") 
    }
  }
}

class EMAILHandler extends InputHandler {
  void onValidate() {
    if (!self.getValue()) {
      self.setRequiredValidation("Email is required") 
    }
  }
}

class SUBMITHandler extends OnClickHandler {
  void onAction() {
    if (!processStep) {
      if (guiScriptService.validateSection("FRM_CCA")) {
        processScriptService.startProcess("PROC_CCA", guiScriptService.readModelMap()) 
        guiScriptService.changeGui("FRM_CCA_RESP", true)
      }
    }
    else {
      if (guiScriptService.validateSection("FRM_CCA")) {
        guiScriptService.saveSection("FRM_CCA")
        if (STATUS.getValue() == "C") {
          processScriptService.executeTask("toEND_CONFIRMED") 
        }
        else {
          processScriptService.executeTask("toEND_REJECTED") 
        }
      }
    }
  }
}