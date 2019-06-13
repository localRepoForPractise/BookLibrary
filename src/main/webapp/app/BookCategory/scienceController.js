/**
 * Main Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('scienceTestController', function($rootScope, $scope, $http,
			HttpService, $location) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
				+ ":" + $location.$$port + "/BookLibrary/";

		
		$scope.scienceBookList = [
			{bookId:'1',bookName:'A',bookAuthor:'a1'},
			{bookId:'2',bookName:'B',bookAuthor:'b2'},
			{bookId:'3',bookName:'C',bookAuthor:'c3'},
			{bookId:'4',bookName:'D',bookAuthor:'d4'},
			{bookId:'5',bookName:'E',bookAuthor:'e5'},
			
		];
	});
}());
