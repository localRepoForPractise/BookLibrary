(function() {
	
	
	app.controller('New',function($rootScope, $scope,$window, $http, HttpService, $location,$localStorage, $sessionStorage) {
	
	
	$scope.submit= function (book){
		$window.alert("okk");
		$window.alert(book.name);
				
		};
		
		
		
});
}());