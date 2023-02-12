<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<script>
  function validateForm() {
    var username = document.forms["form"]["username"].value;
    var email = document.forms["form"]["email"].value;
    var contact = document.forms["form"]["contact"].value;

    if (!username.match(/^[a-zA-Z0-9_]+$/)) {
      alert("Username should only contain alphabets, numbers, and underscores.");
      return false;
    }

    if (!email.match(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/)) {
      alert("Invalid email address.");
      return false;
    }

    if (!contact.match(/^\d{10}$/)) {
      alert("Contact number should only contain 10 digits.");
      return false;
    }

    return true;
  }
  function checkPassword(password, confirmPassword) {
	    if (password === confirmPassword) {
	      return true;
	    }
	    return "Please enter the same password.";
	  }

	  const passwordInput = document.querySelector("#password");
	  const confirmPasswordInput = document.querySelector("#confirmPassword");
	  const resultDisplay = document.querySelector("#result");

	  passwordInput.addEventListener("input", function() {
	    resultDisplay.textContent = checkPassword(passwordInput.value, confirmPasswordInput.value);
	  });

	  confirmPasswordInput.addEventListener("input", function() {
	    resultDisplay.textContent = checkPassword(passwordInput.value, confirmPasswordInput.value);
	  });
</script>

<br>
<div class="container">
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item linkSize"><i
				class="fas fa-tachometer-alt"></i> <a class="link-dark"
				href="<c:url value="/welcome"/>">Home</a></li>
			<li class="breadcrumb-item linkSize active" aria-current="page">
				<i class="fa fa-arrow-right" aria-hidden="true"></i>User
				Registration
			</li>
		</ol>
	</nav>
</div>
<hr>
<div class="container">
	<sf:form method="post"
		action="${pageContext.request.contextPath}/signUp"
		modelAttribute="form">
		<div class="card">
			<h5 class="card-header"
				style="background-color: #00061df7; color: white;">User
				Registration</h5>
			<div class="card-body">
				<b><%@ include file="businessMessage.jsp"%></b>



				<div class="col-md-6">
					<s:bind path="firstName">
						<label for="inputEmail4" class="form-label">First Name</label>
						<sf:input path="${status.expression}"
							placeholder="Enter First Name"  class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="lastName">
						<label for="inputEmail4" class="form-label">Last Name</label>
						<sf:input path="${status.expression}"
							placeholder="Enter Last Name"   class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="login">
						<label for="inputEmail4" class="form-label">Login</label>
						<sf:input path="${status.expression}" placeholder="Enter Login" 
							class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="email">
						<label for="inputEmail4" class="form-label">Email</label>
						<sf:input path="${status.expression}" placeholder="Enter Email" oninput="addHyphen(this)" maxlength="19"
							class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="password">
						<label for="inputEmail4" class="form-label">Password</label>
						<sf:input type="password" path="${status.expression}"
							placeholder="Enter Password" minlength="5" class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="confirmPassword">
						<label for="inputEmail4" class="form-label">Confirm
							Password</label>
						<sf:input type="text" path="${status.expression}"
							placeholder="Enter Confirm Password" minlength="5" class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>

				<div class="col-md-6">
					<s:bind path="contactNo">
						<label for="inputEmail4" class="form-label">Contact No</label>
						<sf:input path="${status.expression}"
							placeholder="Enter Contact No"  minlength="10" class="form-control" />
						<font color="red" style="font-size: 13px"><sf:errors
								path="${status.expression}" /></font>
					</s:bind>
				</div>


				<div class="col-md-6">

					<s:bind path="userType">
						<label for="userType" class="form-label">User Type</label>
						<sf:select class="form-control" path="userType">
							<option disabled="disabled">Select User Type</option>
							
							<sf:option value="customer" label="Customer" />
							<sf:option value="seller" label="Seller" />

						</sf:select>
					</s:bind>


				</div>




				<br>
				<div class="col-12">
					<input type="submit" name="operation"
						class="btn btn-primary pull-right" value="Save"> or <input
						type="submit" name="operation" class="btn btn-primary pull-right"
						value="Reset">
				</div>
			</div>
		</div>
	</sf:form>
</div>