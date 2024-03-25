<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
 <form action =/books>
    <div class="container mt-5">
        <h1>List Book</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Price</th>
                    <th>Action</th>

                    <th><a class="btn btn-success" href="/book/add">Add</a></th>
                </tr>

            </thead>

            <tbody id="books">
            </tbody>
        </table>
    </div>
</body>
<script></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
    $(document).ready(function(){
        $.ajax({
            url: "/book/api/fetch",
        }).done(function(data){
            console.log(data)
            var tr = "<tr>"
            for (let i = 0; i < data.length; i++) {
                tr+= "<td>"+data[i].id+"</td>"
                tr+= "<td>"+data[i].title+"</td>"
                tr+= "<td>"+data[i].author+"</td>"
                tr+= "<td>"+data[i].price+"</td>"
                tr+= "<td><a class='btn btn-success' href='/books/edit/${book.id}'>Edit</a></td>"
                tr+= "<td><a class='btn btn-danger' href='/books/delete/${book.id}'>Delete</a></td>"
                tr+= "</tr>"
                $('#books').append(tr);
            }
            
        })
    });
</script>
</html>