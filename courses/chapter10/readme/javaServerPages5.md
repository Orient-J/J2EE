> # Contents 

1. Expression Language 
2. Accessing Variables or Objects 
3. Relational, Logical and Arithmetic Operators 
4. Implicit Objects in Expression Language 

--- 

> # Expression Language

- added in JSP 2.0 

- for data manipulation, support much simpler syntax 

- To Enable Expression Language expression in JSP

    `
        <%@ page isELIgnored="false"  %>
    `

    - Syntax 

        ` ${ expression language } `

- Used for getting

    - Attributes 
    - header
    - cookies
    - init params 


- Provide operators 

    - relational
    - logical
    - arithmetic 

- Provide **Implicit Objects** in Expression Language 

--- 

> # Accessing Variables or Objects 

| dot operaotr          | square Bracket 
| ---                   | --
| user.name             | user["name"]

--- 

> # Relational, Logical, and Arithmetic Operators 

| Operaoters        | short form        |
| ---               | ---
| ==                | eq
| !=                | ne
| <                 | lt
| >                 | gt
| <=                | le
| >=                | ge 
| &&                | and 
| \|\|              | or
| !                 | not 
| empty             | empty = return **True** when value is null or empty 

---

> # Implicit Objects in Expression Language 

| Implicit Object Name 
| --- 
| pageContext 
| pageScope 
| requestScope
| sessionScope
| applicationScope
| param
| paramValues
| header 
| headerValues
| cookie
| initParam 

---


