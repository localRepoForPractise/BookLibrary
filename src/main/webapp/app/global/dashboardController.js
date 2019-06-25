/**
 * 
 */(function() {

	 var app = angular.module('bookLibraryApp');
	 app.controller('dashboardController', function($rootScope, $scope, $http, HttpService, $location,$localStorage, $sessionStorage) {				
		 
		 function DisplayLoginUserDetails() {												
			 var loggedUserDetails = $localStorage.LocalMessage;
			 if(loggedUserDetails === "")	
			 {															
				 alert("Oops!!!Something went wrong please try to login again...");	
				 $location.path("login");		
			 }
			 else
			 {				
				 $scope.UserName = loggedUserDetails;				
			 }
		 };
		 DisplayLoginUserDetails();
	 });
 }());