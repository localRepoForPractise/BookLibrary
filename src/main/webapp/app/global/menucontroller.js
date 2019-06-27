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
		
		
	

		
		$scope.getData= function (){
			HttpService.POST($rootScope.baseUrl+"home","home").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.menuBookList=[];
					$scope.menuBookList = response.data;
					/*$scope.menuBookList = [
						{menuId: 1, menu_Name: "Home", menuLevel: 0, menuParentId: 0},
						{menuId: 2, menu_Name: "Book Category", menuLevel: 0, menuParentId: 0, subMenuList : [
							{menuId: 5, menu_Name: "Philosophy", menuLevel: 1, menuParentId: 2},
							{menuId: 6, menu_Name: "Science", menuLevel: 1, menuParentId: 2},
							{menuId: 7, menu_Name: "History", menuLevel: 1, menuParentId: 2},
							{menuId: 8, menu_Name: "Art", menuLevel: 1, menuParentId: 2}
							]},
						{menuId: 3, menu_Name: "History", menuLevel: 0, menuParentId: 0},
						{menuId: 4, menu_Name: "Admin", menuLevel: 0, menuParentId: 0}
					];
					
						$scope.subMenuList=[];
					$scope.menuBookList.subMenuList=response.data;
					if(subMenuList.menuParentId=='2')
						{
						subMenuList.push(menuId);
						}*/
									}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};
		
		$scope.getData();		
	});
}());
