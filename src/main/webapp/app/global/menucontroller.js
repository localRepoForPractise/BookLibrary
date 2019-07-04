/**
 * 
 */

/**
 * Main Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('menucontroller', function($rootScope, $scope,
			HttpService, $location) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
		+ ":" + $location.$$port + "/BookLibrary/";




	});
}());
