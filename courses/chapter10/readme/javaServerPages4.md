> # Contents 

* Object Scopes 
* Implicit Objects 

--- 

> # Object Scopes 

 > describe the accessibility of the objects or variable 

## how to create , 2 ways 

- implicily by the container 
- explicily from **action, Expression Language, Scripiting**

| Scopes 
| --- 
| **Page** =  within the page where object is created 
| **Request** = between the pages which process the same request
| **Session** = pages within in a session 
| **Application** = all pages residing in a application or project 

--- 

> # Implicit Objects 

| Object        | Type                                      | Scope 
| ---           | ---                                       | ---
| request       | javax.Servlet.http.HttpServletRequest     | request 
| response      | javax.Servlet.http.HttpServletResponse    | page 
| pageContext   | javax.Servlet.jsp.PageContext             | page 
| session       | javax.Servlet.http.HttpSession            | session
| application   | javax.Servlet.ServletContext              | application 
| out           | javax.Servlet.jsp.JspWriter               | page 
| config        | javax.Servlet.ServletConfig               | page 
| page          | java.lang.Object                          | page 
| exception     | java.lang.Throwable                       | page 

--- 

> ### request 

* when a request is generated, it is created each time 
* request for 

    | request
    | ---
    | parameter 
    | cookies 
    | header information
    | server name 
    | server port 
    | content Type
    | character encoding 
   
    | Operation for JSP request scope 
    | --- 
    | set attribute to 
    | get attribute from 
    | remove attribute from 

--- 

> ### response 

* give response to user 
* redirect, get header information, add cookies, send error messages using this object 

> ### session 

- **set**, **get**, **remove** attribute or to **get** session information
- for storing user data which is used from other jsp pages untill user's session is active 

> ### out 

- to give client as output writting data into a buffer.


--- 

> ### Config 

- to get initailized from a configuration file for a JPS page 

> ### application 

- to get initialized from a configuration file (web.xml) for a JSP page 
- **set**, **get**, **remove** attributes from application scope 

> ### pageContext 

- **set**, **get**, **remove** attributes under 4 scopes

> ### page = this 

- auto generated servlet class will be assigned 

> ### exception 

- exception output 
- only use in error pages 

---



