/**
 * Book History Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('UserBookHistoryController', function($rootScope, $scope, $http,
			HttpService, $location,$window) {
		
		sessionStorage.setItem("USER_ID", JSON.stringify('Pankaj'));
		
		if(sessionStorage.getItem('USER_ID')==null)
			{
			$window.location.href='#home';
			alert("Please login First !!!!!");
			}
		else
			{
			/** TO GET BASE URI OF APP */
			$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
					+ ":" + $location.$$port + "/BookLibrary/";

			
			
			}
		
		

	});
}());