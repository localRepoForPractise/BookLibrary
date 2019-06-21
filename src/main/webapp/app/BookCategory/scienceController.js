/**
 * Main Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('scienceTestController', function($rootScope, $scope,
			HttpService, $location) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
				+ ":" + $location.$$port + "/BookLibrary/";

	
		
		$scope.scienceBookList = [
			{bookId:'1',bookName:'A',bookAuthor:'a1'},
			{bookId:'2',bookName:'B',bookAuthor:'b2'},
			{bookId:'3',bookName:'C',bookAuthor:'c3'},
			{bookId:'4',bookName:'D',bookAuthor:'d4'},
			{bookId:'5',bookName:'E',bookAuthor:'e5'},];
		
		
		$scope.getData= function (){
			HttpService.POST($rootScope.baseUrl+"scienceTest","science").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.scienceBookList=[];
					$scope.scienceBookList = response.data;
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};
		
		$scope.getData();
		
		$scope.addBook = function (){
			console.log("bookName : " + $scope.bookName);
			console.log("bookAuthor : " + $scope.bookAuthor);
			
			var reqData = {
					bookName : $scope.bookName,
					bookAuthor : $scope.bookAuthor
			};
			HttpService.POST($rootScope.baseUrl+"addBook",reqData).then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.getData();
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};
	});
}());
