<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Book Register</title>

        <link href="./css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <form action="bookInfo.jsp" method="get">

            <div class="form-group">
                <input type="text" name="bookId" id="bookId" class="form-control " placeholder=" " autocomplete="false" />
                <label class="form-label bookId-labels" for="bookId">Book Id</label>
            </div> 

            <div class="form-group">
                <input type="text" name="bookName" id="bookName" class="form-control " placeholder=" " autocomplete="false" />
                <label class="form-label bookName-labels" for="bookName">Book Name</label>
            </div>

            <div class="form-group">
                <input type="text" name="arthur" id="arthur" class="form-control " placeholder=" " autocomplete="false" />
                <label class="form-label arthur-labels" for="arthur">Arthur</label>
            </div>

            <div class="form-group">
                <label class="form-label floats published-labels" for="published">Published Date</label>
                <input type="date" name="published" id="published" class="form-control" autocomplete="false" />
            </div>

            <input type="submit" class="btn" value="Register" />

        </form>

    </body>
</html>
