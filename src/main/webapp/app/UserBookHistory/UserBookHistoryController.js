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
		
			$scope.getData= function (){
				HttpService.POST($rootScope.baseUrl+"UserBookHistory",1001).then(function(response){
					if(response.code ==="200"){
						console.log("success",response.data);
						$scope.book=[];
						$scope.book = response.data;
					}
					else if(response.code ==="500")
						console.log("failure",response);
				});
			};
			
			$scope.getData();

			
			
			}
		
		

	});
}());