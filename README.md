Email Sender Application
Overview
This is a simple Java web application built with Spring Boot that allows you to send emails. You can send a single email to one person or send bulk emails to multiple people by uploading a list of email addresses.

Features
Send Single Email:

Enter one email address, a subject, and a message, then send the email.
Send Bulk Emails:

Upload a .txt file with multiple email addresses (one per line).
Enter a subject and message, then send the email to everyone on the list.
User Interface:

A simple and clean web page(Html, Css and Vue.js) with forms to send single or bulk emails.
Backend:

Built with Spring Boot.
Uses Jakarta Mail (JavaMailSender) to send emails.
Separate endpoints for sending single and bulk emails.
Configured to allow frontend and backend to communicate.

Set Up SMTP Settings:

Edit the application.properties(or .yaml) file with your email server details (SMTP server, port, username, and password).

spring:
  mail:
    properties:
      mail:
        smtp:
          starttls:
            enable: 'true'
          auth: 'true'
    host: hostname
    username: noreply@javaazerbaycan.com
    password: mailPassword
    port: '587'

Usage
Send a Single Email:

Fill in the recipient's email address, subject, and message.
Click "Göndər" to send it.
Send Bulk Emails:

Upload a .txt file with email addresses.
Fill in the subject and message.
Click "Toplu Göndər" to send it to everyone in the file.

Contributing
Feel free to contribute! You can open an issue if you find any bugs or have ideas to improve the project.

Contact
If you have any questions, you can contact me at mibadullayev98@gmail.com.

