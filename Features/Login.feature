Feature: login

Scenario: succesfull login with valid credentials
         Given user launches chrome browser
         When user opens url "https://products.ncryptedprojects.com/thumbpin/admin-nct/modules-nct/login-nct/"
         And user enters username as "admin" and password as "admin123"
         And clicks on login button
         Then page title should be "Welcome to Admin Panel - Thumbpin"
         When user clicks on logout link
         Then page title should be "Login - Thumbpin"
         And close browser
