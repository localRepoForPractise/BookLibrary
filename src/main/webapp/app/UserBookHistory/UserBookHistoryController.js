/**
 * Book History Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('UserBookHistoryController', function($rootScope, $scope, $http,$sessionStorage,
			HttpService, $location,$window) {		

		if($sessionStorage.userDetails == null)
		{			
			alert("Please Login to view enroll books history!!!");
			 $location.path("login");		
		}
		else
		{		
			/** TO GET BASE URI OF APP */
			$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
			+ ":" + $location.$$port + "/BookLibrary/";

			var UserID = $sessionStorage.userDetails.userId;			

			$scope.getData= function (){
				HttpService.POST($rootScope.baseUrl+"UserBookHistory",UserID).then(function(response){
					if(response.code ==="200"){
						//console.log("success",response.data);
						$scope.book=[];
						$scope.book = response.data;						
					}
					else if(response.code ==="500")
						//console.log("failure",response);
						alert("Oops...Something went wrong please try again!!!");
				});
			};
			$scope.getData();
		}
	});
}());