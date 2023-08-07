# Writer's Cube
## Spring Angular app demo

This repository contains a Spring Boot Angular application which can be used by creative writers looking to storyboard ideas. It can also be used as an example for integrating OpenAI's API with your backend to make calls to ChatGPT. In this case, calls are being made requesting ChatGPT to generate random plotpoints based on the description of a specific story.

# Dashboard 
![dashboard](https://github.com/hannovv/writers-cube/assets/140002985/bfc3166c-b384-4dc9-93a4-9ffdb0e3bfea)
##### ** Note: As of now there is no functionality on the "create new storyboard" button. All the storyboards are populated using mock data on the backend.

# View All Storyboards page

![viewstoryboards](https://github.com/hannovv/writers-cube/assets/140002985/df41787d-be83-4f5e-b0bf-8dfcf161cad2)

# Storyboard Details page

![storyboarddetails](https://github.com/hannovv/writers-cube/assets/140002985/6c5108f6-5fca-46f1-bcf1-e4c2653e878c)

##### ** Note: Some of these plotpoints are pre-populated from the backend, but there is functionality to delete and add new plotpoints.

## Project Setup
Make sure you have the following installed before running the application:
-JDK version 17 
-Node.js version 18
-Angular CLI version 16
-OpenAI API account

Follow these steps to run the applicatin locally:
1. Clone this repository to your machine:
   ```
   git clone https://github.com/hannovv/writers-cube.git
   ```
2. Navigate to the project's root directory:
   ```
   cd writers-cube
   ```
3. ### OpenAI integration
   If you'd like to use the OpenAI functionality of this application, you'll need to sign up for OpenAI's API account. On signing up, you should be given a certain amount of credit for free, but after that you'll need to pay for each call you make. Once you sign up, generate a key on OpenAI's website (make sure you store it somewhere safe since you won't be able to access it once it's been generated). Do not put your credentials anywhere public; instead, set them as environment variables on your machine. They can then be accessed in your application.properties file.

4. Build and run the backend application. It will start running on `http://localhost:8080`

5. Open your preferred IDE for angular and navigate to the frontend project
   ```
   cd writers-cube-ui/angularclient
   ```
6. Install frontend dependencies
   ```
   npm install
   ```
7. Start the frontend application
   ```
   ng serve
   ```
  It will be running on `http://localhost:4200`.

## Endpoints 
#### I recommend using PostMan to test any endpoints in the backend controller. Here are the current endpoints:
- GET all storyboards:
  ```
  http://localhost:8080/storyboards
  ```
- GET storyboard by id:
  ```
  http://localhost:8080/storyboards/{id}
  ```
- POST new plotpoint:
  This request must be sent with a body containing raw data in JSON format, for example,
  "{
    "id": "10",
    "storyBoardId": "4",
    "description": "A wild polar bear appears"
}"
  ```
  http://localhost:8080/plotpoints
  ```
- POST make a call to the OpenAI API:  This request must be sent with a body containing raw data in JSON format, for example,
  "{
    "storyBoardId": "4",
    "prompt": "Write me a 1 sentence plotpoint for a story about a vampire who falls in love with a scientist"
}"
  ```
  http://localhost:8080/chat
  ```
- DELETE plotpoint by id:
  ```
  http://localhost:8080/{id}
  ```
### Additional Resources
  - A helpful tutorial on integrating ChatGPT into a backend application: https://www.baeldung.com/spring-boot-chatgpt-api-openai
  - Source code for the cube rendering: https://davidwalsh.name/css-cube



