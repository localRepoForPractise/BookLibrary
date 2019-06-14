/**
 * Book History Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('UserBookHistoryController', function($rootScope, $scope, $http,
			HttpService, $location) {
		
		
		
		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
				+ ":" + $location.$$port + "/BookLibrary/";

		

	});
}());