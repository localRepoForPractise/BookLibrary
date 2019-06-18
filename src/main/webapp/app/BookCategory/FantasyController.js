(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('FantasyController', function($rootScope, $scope, $http,
			HttpService, $location) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
				+ ":" + $location.$$port + "/BookLibrary/";

		
		$scope.HistoryBookList = [
			{BookId:'101',BookName:'F1',BookAuthor:'Fa1',CategoryId:'01'},
			{BookId:'102',BookName:'F2',BookAuthor:'Fb2',CategoryId:'01'},
			{BookId:'103',BookName:'F3',BookAuthor:'Fc3',CategoryId:'01'},
			{BookId:'104',BookName:'F4',BookAuthor:'Fd4',CategoryId:'01'},
			{BookId:'105',BookName:'F5',BookAuthor:'Fe5',CategoryId:'01'},
			
		];
	});
}());

