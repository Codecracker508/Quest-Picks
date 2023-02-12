<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page isELIgnored="false"%>

<script>
    function updatePrice(index) {
        var quantity = document.getElementsByName("quantity" + (index + 1))[0].value;
        var price = document.getElementsByName("price" + (index + 1))[0].value;
        document.getElementsByName("totalPrice" + (index + 1))[0].value = quantity * price;
        document.getElementsByName("total" + (index + 1))[0].value = quantity * price;
    }
    
</script>

<c:url var="addUrl" value="/ctl/cart" />

<c:url var="addSearch" value="/ctl/cart/search" />

<c:url var="editUrl" value="/ctl/cart?id=" />
<br>
<div class="container">
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item linkSize"><i
				class="fas fa-tachometer-alt"></i> <a class="link-dark"
				href="<c:url value="/welcome"/>">Home</a></li>
			<li class="breadcrumb-item linkSize active" aria-current="page">
				<i class="fa fa-arrow-right" aria-hidden="true"></i>Cart List
			</li>
		</ol>
	</nav>
</div>
<hr>

<form action="${addSearch}" method="post">
	<div class="card">
		<h5 class="card-header"
			style="background-color: #00061df7; color: white;">Cart</h5>
		<div class="card-body">
			<b><%@ include file="businessMessage.jsp"%></b>
			<br>
			<table class="table table-bordered border-primary">
				<thead>
					<tr>

						<th scope="col">#</th>
						<th scope="col">Image</th>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
						<th scope="col">Quantity</th>
						<th scope="col">Total Price</th>

						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:set var="totalp" value="${0}" />
					<c:forEach items="${list}" var="ct" varStatus="cart">
						<tr>
							<td scope="row">${cart.index+1}</td>
							<td scope="row"><img
								src="<c:url value="/ctl/product/getImage/${ct.product.id}" />"
								width="100px" height="100px"></td>
							<td scope="row">${ct.product.name}</td>
							<td scope="row">${ct.product.price}</td>
							<td scope="row"><input type="text"
								name="quantity${cart.index+1}" class="form-control"
								value="${ct.quantity}" oninput="updatePrice(${cart.index})"></td>
							<input type="hidden" name="price${cart.index+1}"
								value="${ct.product.price}" />
							<td scope="row"><input type="text"
								name="totalPrice${cart.index+1}" class="form-control"
								value="${ct.totalPrice}" readonly /></td>
							<td><a
								href="<c:url value="/ctl/cart/search?cid=${ct.id}&operation=Delete"/>"
								class="btn btn-primary btn btn-info">Remove</a></td>
						</tr>
						<c:set var="totalp" value="${totalp + ct.totalPrice}" />
					</c:forEach>
					<tr>
						<td colspan="5">Total</td>
						<td scope="row"><input type="text"
								name="total${cart.index+1}" class="form-control"
								value="${ct.totalPrice}" readonly /></td>
					</tr>

				</tbody>
			</table>
			<div class="row">
				<div class="col-11"></div>
				<div class="col-1">

					<c:if test="${listsize>0}">
						<input type="submit" value="Checkout" name="operation"
							class="btn  btn-info">
					</c:if>
				</div>
			</div>
			<br>

		</div>
</form>

<br>