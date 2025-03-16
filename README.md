# BrickDoorFrontend
Frontend for BrickDoor, a place for Guelph Co-op University Students to discuss co-op and interview experiences
Brickdoor

Brickdoor is a platform for University of Guelph Co-op students to discuss co-op and interview experiences. Inspired by professional networking platforms, Brickdoor enables students to share insights, ask questions, and engage with peers about the job search process.

Features

🔍 Search for Company Threads - Find discussions on specific employers and their hiring processes.

📝 View Company Threads - Access interview experiences, job insights, and company reviews.

➕ Create New Threads - Share your personal experiences and tips for others.

📂 File Uploads (Future Feature) - Upload and share relevant interview materials.

🔒 User Authentication (Upcoming) - Secure login and user profiles.

Tech Stack

Backend

Spring Boot - REST API development

PostgreSQL - Database management

AWS S3 - File storage (planned)

Redis (optional) - Caching for improved performance

Kafka (optional) - Event-driven messaging

Frontend

React (Vite + TypeScript) - User interface

Tailwind CSS - Styling framework

Setup Instructions

Prerequisites

Java 17+ (for Spring Boot backend)

Node.js + npm (for React frontend)

PostgreSQL (Database)

AWS credentials (if using S3 for file storage)


Running the Backend

Clone the repository:
git clone https://github.com/Hamzah023/brickdoor.git
cd brickdoor/backend

Configure the database in application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/brickdoor
spring.datasource.username=your_username
spring.datasource.password=your_password

Run the application:

./mvnw spring-boot:run

Running the Frontend

Navigate to the frontend directory:
cd brickdoor/frontend

Install dependencies:
npm install

run the react app:
npm run dev


API Endpoints (Example)

Create a Company Thread

POST /api/threads
{
  "companyName": "Google",
  "title": "My Google Interview Experience",
  "content": "I went through 3 rounds of interviews..."
}
