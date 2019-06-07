(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('mainController', function($rootScope, $scope, $http,
			HttpService, $location) {
		
		$scope.connection='';
		$rootScope.baseUrl = $location.$$absUrl.substring(0, $location.$$absUrl.length-2);
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
