package process

import pl.bpm4cloud.script.ProcessScriptHandler

class RegisterHandler extends ProcessScriptHandler {
  String run() {
    String email = model.getValue("ModelFRM_CCA.EMAIL")
    if (email) {
      mail.sendMail([email] as String[], "REGISTRATION", """\
      <html>
      <body>
      <h1>Registration confirmation!</h1>
      <p>Your application number: ${processId}</p>
      </body>
      </html>
      """) 
    }
    return "toCALL_CENTER" 
  }
}