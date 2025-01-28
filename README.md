## JDBC Connection Using `maven`

This is a simple implementation of JDBC Connection only using `maven` and `mysql`

- Download the `mysql` server and workbench
- Add the below code onto the new `.sql` file
  
```sql
CREATE SCHEMA users;

CREATE TABLE user_details (
    id SERIAL PRIMARY KEY,
	username TEXT NOT NULL,
    phone_number VARCHAR(15) NOT NULL
);

INSERT INTO 
	user_details 
VALUES 
	(1, "Vidhan", "+91 1234567890"), 
	(2, "Vin", "+01 0987654321");
```

- Save it and add below dependency onto the `pom.xml` file
  
```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>9.2.0</version>
    </dependency>
</dependencies>
```

- Right-click on the `pom.xml` -> under `maven` -> `sync project` and it's done.
- Now you can run this project by executing the [`JDBCMySQLConnector.java`](src/main/java/itsvidhanreddy/JDBCMySQLConnector.java) file.
- Inorder to run the `Prepared Statement` Demo by executing the [`JDBCPreparedStatement`](src/main/java/itsvidhanreddy/JDBCPreparedStatement.java) file.

- Visit my linkedin profile from [here](https://linkedin.com/in/AVidhanR)

$$By\text{ }AVidhanR$$
