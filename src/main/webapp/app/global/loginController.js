/**
* Main Controller of Book Library App
*/
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('loginController', function($rootScope, $scope, $http, HttpService, $location) {
		
		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";									
		
		$scope.submit= function (login){
			
			var reqData = {
					userName : login.userName,
					password : login.password
			};
			HttpService.POST($rootScope.baseUrl + 'login',login).then(
					function successCallback(response) {																							
						if(response.code==="200")							
							console.log("SUCCESS");					
						else if(response.code==="500")
							console.log("FAILURE");											
					});
		}
	});
}());


