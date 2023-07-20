# JSTL = JSP STANDARD TAG LIBRARY

> # CONTENTS 

- What is Custom Tag Library
- What is JSTL
- JSTL URLs and Default Prefixes 
- Core Tag Library 

    - Variable Support
    - Flow Control
    - URL Management 
    - Output
    - Exception Handling 

- JSTL Implicit Objects 

---

> # WHAT IS CUSTOM TAG LIBRARY 

- JSP page support collection of custom tags 
- Between different JSP pages, portable
- without embedding java codes/ using scriping elements, possible to write JSP

    | benefits
    |---
    | easy to maintain code 
    | Logic is different from presentation
    | break up between web designer and Java Developer

---

> # WHAT IS JSTL 

- JavaServer Pages Standard Tag Library
- collection of useful JSP tags 

    | Tag Libraries 
    | ---
    | Core
    | XML
    | Internationalization / Formatting
    | SQL
    | Functions 

--- 

> # JSTL URIS and Default Prefixes 

| Library           | URI                                       | Default Prefix 
| ---               | ---                                       | ---
| Core              | http://java.sun.com/jsp/jstl/core         | c
| XML               | http://java.sun.com/jsp/jstl/xml          | x
| I18N/Formatting   | http://java.sun.com/jsp/jstl/fmt          | fmt
| Database          | http://java.sun.com/jsp/jstl/sql          | sql
| Functions         | http://java.sun.com/jsp/jstl/functions    | fn

---


> # DECLARING A CUSTOM TAG LIBRARY 

<%@ 

**[declartive_name]** 

uri="**[library_uri_from_above_table]**" 

prefix="**[as_you_like]**" 

%>

example :: 

 > `<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>`
 
---

> # Using Actions From Tag Library 

- Method 1


        <prefix:action_name attribute="value" attribute2="value2">
            action_body
        </prefix>

- Method 2 


        <prefix:action_name attr1="value1" attr2="value2" />

    where, 

    prefix = **core, xml, database, functions, ...**

    action_name = actions associated with prefix, different prefix , different actions

--- 

> # CORE TAG LIBRARY 

## Variable Support 

- **<c:remove>** = to remove declared variables 

- **<c:set>** = to define a variable

## Flow Control 

-       <c:choose>

            <c:when>
            </c:when>


            <c:when>
            </c:when>

            ...   

            <c:otherwise> 
            </c:otherwise>

        </c:choose>


-       <c:forEach  items="array|collection"    
                    [var="var"] 
                    [varStatus="varStatus"] 
                    [begin="startIndex"] 
                    [end="endIndex"]
                    [step="Increment|Decrement"]
                    >

                JSP Elements



        </c:forEach>


- FOR TOKENS for string 

        <core:forTokens 
        
            items = "array"
            delims = "delimiters"
            [var = "variable"]
            [varStatus = "variable status"]
            [begin = "start index"]
            [end = "end index"]
            [step = "increment | decrement"]
         >

        </core:forTokens>


## Output

- <c:out >

        1. Method 1

                <c:out 
                        value="expressionLanguage" 
                        [escapeXml="true|false"]
                        [default="defaultExpression"]
                />

        2. Method 2

                <c:out value="expression" [escapeXml="true|false"] >
                    defaultExperssion
                </c:out>

