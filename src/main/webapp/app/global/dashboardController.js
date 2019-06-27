/**
 * 
 */(function() {

	 var app = angular.module('bookLibraryApp');
	 app.controller('dashboardController', function($rootScope, $scope, HttpService, $location,$localStorage, $sessionStorage,dataService) {				
		 
		/*$scope.userDetails = dataService.getData();
		 console.log("Login: ",$scope.userDetails);
		 if($scope.userDetails!=null)
			 dataService.addData(null);*/
		 
		 $scope.userDetails = $sessionStorage.userDetails;
		 
		 function DisplayLoginUserDetails() {												
			 var loggedUserDetails = $sessionStorage.LocalMessage;
			 if(loggedUserDetails === "")	
			 {															
				 alert("Oops!!!Something went wrong please try to login again...");	
				 $location.path("login");		
			 }
			 else
			 {				
				 $scope.UserName = loggedUserDetails;							
			 }
		 }
		 
		 $scope.logout = function () {
			 sessionStorage.clear();
			  $location.path('/home');
         };
	 });
 }());