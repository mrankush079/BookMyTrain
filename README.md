A simple Java console-based train reservation application featuring:

User registration & login

Train search by source–destination

Booking and cancellation of tickets

Viewing personal bookings

Listing all trains


Features
User Module: Register, login/logout, update profile

Train Module: View available trains with seat status

Booking Module: Search, book seats, cancel bookings

Ticket Management: Auto-generated ticket IDs, per-user history


📦 Project Structure

├── src/
│   ├── IRCTCAPP.java           – Main CLI application
│   ├── BookingService.java     – Train booking logic
│   ├── UserService.java        – User authentication & session
│   ├── Train.java              – Train entity
│   ├── Ticket.java             – Ticket entity
│   └── User.java               – User entity
└── README.md                   – This file


Prerequisites

Java 8 or newer
No external dependencies or database required — data is stored in-memory

 How to Run
Clone or download the project

Compile all .java files:
javac src/*.java

Run the console application:
java -cp src IRCTCAPP

Register a new user or login with an existing username/password to access features




