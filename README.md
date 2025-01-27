## JDBC Connection Using `maven`

This is a simple implementation of JDBC Connection only using `maven` and `mysql`

- Download the `mysql` server and workbench
- Add the below code onto the new `.sql` file
  
```sql
CREATE SCHEMA Users;

CREATE TABLE UserDetails (
	username TEXT NOT NULL,
    pwd TEXT NOT NULL
);

INSERT INTO UserDetails VALUES ("Vidhan Reddy", "Vin"), ("Vijay", "Thalapathi"); 
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
- Now you can run this project by executing the `JDBCMySQLConnector.java` file.

- Visit my linkedin profile from [here](https://linkedin.com/in/AVidhanR)

$$By\text{ }AVidhanR$$
