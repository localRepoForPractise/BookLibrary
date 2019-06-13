/**
* Main Controller of Book Library App
*/
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('scienceControllers', function($rootScope, $scope, $http, HttpService, $location) {
		
		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		$scope.connection='';
		
		$scope.IsVisible = false;
        $scope.ScienceBooks = function () {
             $scope.Books = [
            	{Book_Id:101,Category_Id:1,Book_Name:'Elegant Universe ',Book_Author:'Brian Greene ',Created_By:'smore11',Created_Date:'12/06/19'},
                {Book_Id:102,Category_Id:1,Book_Name:'Artificial Intelligence',Book_Author:' Melanie Mitchell',Created_By:'smore11',Created_Date:'12/06/19'},
                {Book_Id:103,Category_Id:1,Book_Name:'Know-It-All Society',Book_Author:' Michael P. Lynch',Created_By:'smore11',Created_Date:'12/06/19'},
             ], 
            $scope.IsVisible = true;
        };		
		
        $scope.ScienceBooks();
        
		/*$scope.ScienceBooks=function (Science)
		{
			var reqData=Science;
			HttpService.POST($rootScope.baseUrl + 'Science',reqData).then(
					function successCallback(response) {
						if(response.code==="200")
							console.log("SUCCESS");
						else if(response.code==="500")
							console.log("FAILURE");
			}
		};
		*/
		
	});
}());