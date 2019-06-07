(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('mainController', function($rootScope, $scope, $http, HttpService, $location) {
		
		$scope.connection='';
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		
		function checkConnection() {
			HttpService.GET($rootScope.baseUrl + 'checkConnection').then(
					function successCallback(response) {
						console.log("Connection: ", response);
						$scope.connection = "Connection: " + response.message;
					});
		};

		checkConnection();
	});
}());
