> # Contents 

- Action
- JSP Standard Action 

---

> # Actions 

### For what Standard Actions is used

- Dynamically Inserting a file to the page 
- reusing JavaBeans Components 
- forwarding execution to another HTML page, JSP Page, or Servlet
- including a Java Applet in JSP page 

---

> # JSP Standard Actions

### `<jsp:action_Tag>` = jsp action tag syntax 

| Action Tags               
| -----------                
| **useBean**   = make a Java Object ( Java Bean ) available for use
| **getProperty**   = access a defined property of a bean                
| **setProperty** = set a bean property value 
| **include** = include both static and dynamic resources on JSP Page
| **forward** = forward the current request to a JSP page or a Servlet 
| **plugin** = include a Java Applet in a JSP page 
| **param**  = pass parameter values to other actions using a name/ value pair 


---

> # Java Bean 

- Java Class 
- reusable software component 
- easy maintanance

| Differences
| ---
| no argument construcotr 
| should be Serializable 
| for values of properties , set / get methods = getter , setter methods 


## Attributes of Java Bean 

| Attribute 
|---
| **id** = case sensitive, identify object instance 
| **scope** = page (default) , request, session, application
| **class** = case sensitive
| **beanName** = name of a Bean, provide `instantiate()` method of *java.beans.Beans.class*
| **type** = (Optional) object class, superclass or interface implemented by the class 


> ` <jsp:useBean ="course" scope="page| request| session| application" class="java bean path" /> `


## Attributes of `getProperty` 

| Attribute
| ---
| **name** = The name of the object from which the property is obtained 
| **property** = Name of the property to get 

> ` <jsp:getProperty name="course" property="course_id" /> `

## Attributes of `setProperty`

| Attribute
| ---
| name = The name of the bean instance 
| property = Name of the bean property that's being set 
| param = The name of the request parameter whose value you want to give to a bean property 
| value = The Value of assign to the given propery 

> ` <jsp:setProperty name="course" property="course_name" param="c_name" /> `

or

> ` <jsp:setProperty name="course" property="*" /> `
---






