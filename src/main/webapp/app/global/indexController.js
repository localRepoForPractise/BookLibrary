(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('mainController', function($rootScope,$scope, $http,HttpService,$location) {

	$rootScope.baseUrl = $location.$$absUrl;
	function checkConnection() {
		HttpService.GET($rootScope.baseUrl + 'checkConnection').then(function successCallback(response) {
			console.log("Connection: ", response);
		});
	};
		
	checkConnection();
	});
}());
