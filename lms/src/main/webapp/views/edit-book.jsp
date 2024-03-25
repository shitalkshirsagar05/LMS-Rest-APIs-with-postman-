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
    <title>Edit Book</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<form action="/books/update" method="POST">
    <div class="container mt-5">
        <h1 class="text-center">Edit Book</h1>
        <div class="row mt-5">
            <div class="col-md-6 offset-md-3">
                <form>
                    <div class="mb-3">
                        <input type="hidden" class="form-control" id="bookId" name="id" value="${book.id}" required>
                    </div>
                    <div class="mb-3">
                        <label for="bookTitle" class="form-label">Book Title</label>
                        <input type="text" class="form-control" name="title" id="bookTitle" value="${book.title}" required>
                    </div>
                    <div class="mb-3">
                        <label for="bookAuthor" class="form-label">Book Author</label>
                        <input type="text" class="form-control" name="author" id="bookAuthor" value="${book.author}" required>
                    </div>
                    <div class="mb-3">
                        <label for="bookPrice" class="form-label">Book Price</label>
                        <input type="text" class="form-control" name="price" id="bookPrice" value="${book.price}" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Edit Book</button>
                </form>
            </div>
        </div>
    </div>
    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>
