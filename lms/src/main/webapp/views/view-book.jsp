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
    <title>View Book</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
 <form action =/view>
    <div class="container mt-5">
        <h1>View Book</h1>
        <div class="row mt-4">
            <div class="col-md-6">
                <div class="mb-3">
                    <label for="bookId" class="form-label">Book ID</label>
                    <label>${book.id}</label>
                </div>
                <div class="mb-3">
                    <label for="bookTitle" class="form-label">Title</label>
                    <label>${book.title}</label>
                </div>
                <div class="mb-3">
                    <label for="bookAuthor" class="form-label">Author</label>
                    <label>${book.author}</label>
                </div>
                <div class="mb-3">
                    <label for="bookPrice" class="form-label">Price</label>
                    <label>${book.price}</label>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optional, only if you need JS features) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
