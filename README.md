# Craftyfy Automation Testing Framework

This project is a Selenium automation framework built using **Java + Selenium + TestNG + Maven** to test the Craftyfy e-commerce website.

 Application URL: https://craftyfy-frontend.vercel.app/

---

##  Tech Stack Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- JDBC (MySQL)
- Git & GitHub
- Eclipse IDE

---

## 📂 Project Structure

src  
├── main  
│   ├── java  
│   │   ├── base        → BaseTest (browser setup & teardown)  
│   │   ├── pages       → Page Object classes (HomePage, LoginPage, CartPage)  
│   │   ├── utils       → ConfigReader, DBUtils, ScreenshotUtils  
│   └── resources  
│       └── config.properties  
│  
├── test  
│   └── java  
│       └── tests       → TestNG test classes (LoginTest, CartTest)  
│  
├── pom.xml  
├── testng.xml  
└── README.md  

---

##  Test Scenarios Automated

### Login
- Valid login
- Invalid login
- Error message validation

### Cart
- Add product to cart
- Update quantity
- Remove item from cart
- Cart item visibility

### Navigation
- Home
- Collection
- About
- Contact page validation

---

## JDBC Integration

- Connects to MySQL database
- Inserts test users dynamically
- Validates UI data against DB records

---

##  Configuration (config.properties)

```properties
url=https://craftyfy-frontend.vercel.app/
browser=chrome

validEmail=sdet2025@gmail.com
validPassword=sdet2025

invalidEmail=wrong@gmail.com
invalidPassword=wrong123

dbUrl=jdbc:mysql://localhost:3306/testdb
dbUser=agalen
dbPassword=3000x
