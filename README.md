# Spring Security for Google Auth
Demo of using built-in Spring Security OAuth2 to extract Google Auth identity

## Setup
1. Create a GCP project at http://console.cloud.google.com.
1. Create an OAuth Client ID through the APIs & Services > Credentials screen
1. Set the client ID (not the secret!) environment variable, so the appication can access it. 
   Linux example:
  ```
  export google_client_id=[YOUR_CLIENT_ID]
  ```
1. Run the application!
  ```
   mvn clean spring-boot:run
  ```
1. Test it out -- go to http://localhost:8080/, log in, and press the "Who am I" button.