/**
 * Main Controller of Book Library App
 */
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('mainController', function($rootScope, $scope, $http, HttpService, $location,$sessionStorage) {

		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		$scope.connection='';

		/**TO Check connection with DataBase
		 * */
		function checkConnection() {
			HttpService.GET($rootScope.baseUrl + 'checkConnection').then(
					function successCallback(response) {
						/**console.log("Connection: ", response);*/
						$scope.connection = "Connection: " + response.message;
					});
		};
		checkConnection();
		

		$scope.submit= function (testVariable){

			var reqData = testVariable;
			HttpService.POST($rootScope.baseUrl + 'testVariable',reqData).then(
					function successCallback(response) {
						if(response.code==="200")
							console.log("SUCCESS");
						else if(response.code==="500")
							console.log("FAILURE");

						/**console.log("Connection: ", response);*/
						//$scope.connection = "Connection: " + response.message;
					});
		}

		$scope.getData= function (){
			HttpService.POST($rootScope.baseUrl+"home","home").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.menuBookList=[];
					$scope.menuBookList = response.data;	
											
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};

		$scope.getData();	
		
		 function DisplayLoginUserDetails() {												
			 $rootScope.userDetails = $sessionStorage.userDetails;
			 if($scope.userDetails === "")	
			 {															
				 alert("Oops!!!Something went wrong please try to login again...");					
			 }
			 else
			 {				
				 //Show session data
			 }
		 }
		 
		 DisplayLoginUserDetails();
		 
		 $scope.logout = function () {
			 sessionStorage.clear();
			 $rootScope.userDetails =null;
			  $location.path('/home');
         };
         
	});
}());
