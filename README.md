# Credit Card Application process
*Source code for [online4m](https://www.online4m.com) process driven online forms service*

[online4m](https://www.online4m.com) is a service for design and execution of process driven online forms. 
Fast, simple and pragmatic business process development.

This repository contains source code for article [*Video: 3 easy steps to create credit card application process to acquire new leads.*](http://www.online4m.com/blog/articles/online4m-cca-process/).

## Installation procedure

### Step 1: download repository

  $ git clone https://github.com/zedar/online4m-cca-process.git

### Step 2: sign in the online4m

Login to your account in *online4m* service - [*online4m/Sign In*](https://www.online4m.com/online4m/login/auth).  
If you do not have account, just sign up - free trial available - [*online4m/Sign Up*](https://www.online4m.com/online4m/usr/create).

### Step 3: create new project: CreditCardApplication

### Step 4: import form definition

Open form definition editor by selecting *New/Form Design* in toolbar under *Navigation* panel. Then select *Serialize Form Design to JSON*.  

In the dialog *GUI serialized to JSON* replace json string with the content of file:

    form/FRM_CCA.json

Click *Change definition* button.

Save form by selecting *Save Form Design* from the toolbar under *Navigation* panel.

In the dialog *Save Form Design* select project name (as was created in *Step 3*), enter **FRM_CCA** in *Code Name* and **FRM_CCA** in *Name* attribute.

Again, select *New/Form Design* option from the toolbar under *Navigation* panel. Then select *Serialize Form Design to JSON*.  

In the dialog *GUI serialization to JSON* replace json string with the content of file:

    form/FRM_CCA_RESP.json

Click *Change definition* button.

Save form by selecting *Save Form Design* from the toolbar under *Navigation* panel.

In the dialog *Save Form Design* select project name (as was created in *Step 3*), enter **FRM_CCA_RESP** in *Code Name* and **FRM_CCA_RESP** in *Name* attribute.


### Step 5: import process definition

Open process definition designer by selecting *New/Process Design* in toolbar under *Navigation* panel. Then select *Serializa Process Design to JSON*.  

In the dialog *Process serialized to JSON* replace json string with the content of file:

    process/PROC_CCA.json

Click *Change definition* button.

Save process by selecting *Save Process Design* from the toolbar under *Navigation* panel. 

In the dialog *Save Process Design* select project name (as was created in *Step 3*), enter **PROC_CCA** in *Code Name* attribute and **PROC_CCA** in the *Name* attribute.

### Step 6: import gui ruleset

Open code editor by selecting *New/Control Rule File* in toolbar under *Navigation* panel.  
Copy and paste source code into the editor from the file:

    ruleset/gui/CCA_GUIRuleset.groovy

Save ruleset by selecting *Save Control Ruleset* from the toolbar under *Navigation* panel. 

In the dialog *Save Control Ruleset* select project name (as was create in *Step 3*), enter **CCA_GUIRuleset** as *Code Name* attribute.

### Step 7: import process ruleset

Repeat steps from *Step 6* but copy and paste the content of the

    ruleset/process/CCA_PROCESSRuleset.groovy

Save ruleset by selecting *Save Control Ruleset* from the toolbar under *Navigation* panel. 

In the dialog *Save Control Ruleset* select project name (as was create in *Step 3*), enter **CCA_PROCESSRuleset** as *Code Name* attribute.

### Step 8: try it

In **test/test.html** folder there is example page that displays first online form.
