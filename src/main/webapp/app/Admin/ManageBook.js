(function() {
	
	
	var app =angular.module('bookLibraryApp');

app.controller('ManageBook',function($rootScope, $scope,$window, $http, HttpService, $location,$localStorage, $sessionStorage) {
	
	
	$scope.submit= function (book){
		$window.alert(book.bauthor);
		$window.alert(book.name);
				
		};
		
		
		
});
}());