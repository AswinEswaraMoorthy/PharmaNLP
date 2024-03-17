 Feature: CreateProject

  Scenario Outline: Creating projects
    When user creates a project without Add Collaborators
    When Verify the Project is created successfully without Add collaborators
    When user creates a project with Add Collaborators
    When Verify the Project is created successfully with Add collaborators
    When user creates a project with ByPassscreeningProcess 
    When user creates a project with guest user and Configure Fields for Data Extraction
    When user Edit the project name
    When user Edit the collaborators name
    When user duplictaes the project
    When user delete the project
    
    
    


   