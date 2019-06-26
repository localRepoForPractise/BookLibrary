(function() {
	
	
	var app=angular.module('bookLibraryApp');

app.controller('Admin_Homepage',function($rootScope, $scope,$window, $http, HttpService, $location,$localStorage, $sessionStorage) {
	
	
	$scope.submit= function (AdminLogin){

		var reqData = {
				userName : AdminLogin.uname,
				password : AdminLogin.upass
				
				
		};

		if(angular.equals(AdminLogin.uname,"admin") && angular.equals(AdminLogin.upass,"admin"))
				{
				 alert("Login Successful");
				
			        $window.location.href = '#Admin_Firstpage'; 
			        //Re-direction to some page
				 
			      } else if (user != "admin") {
			        alert("Invalid username");
			      } else if (pass != "admin" && user == "admin") {
			        alert("Invalid password");
			      }
		else
			{
			alert("Invalid Credentials !!!");
		   }
		
	}
	
	
	
	
});
}());
