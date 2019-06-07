/**
* Main Controller of Book Library App
*/
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('mainController', function($rootScope, $scope, $http, HttpService, $location) {
		
		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		$scope.connection='';
		
		/**TO Check connection with DataBase
		 * */
		function checkConnection() {
			HttpService.GET($rootScope.baseUrl + 'checkConnection').then(
					function successCallback(response) {
						/**console.log("Connection: ", response);*/
						$scope.connection = "Connection: " + response.message;
					});
		};
		checkConnection();
		
		$scope.submit= function (testVariable){
			
			var reqData = testVariable;
			HttpService.POST($rootScope.baseUrl + 'testVariable',reqData).then(
					function successCallback(response) {
						if(response.code==="200")
							console.log("SUCCESS");
						else if(response.code==="500")
							console.log("FAILURE");
						
						/**console.log("Connection: ", response);*/
						//$scope.connection = "Connection: " + response.message;
					});
		}
	});
}());
