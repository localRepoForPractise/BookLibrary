/**
 * Router Configuration.
 */

(function () {
	'use strict';

	var routerApp = angular.module('bookLibraryApp');
	routerApp.config(function($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('/', {
			url: '/',
			templateUrl : './app/global/home.html',
			//controller  : 'mainController',
		})
		.state('/home', {
			url: '/home',
			templateUrl : './app/global/home.html',
			//controller_  : 'mainController',
		})
		.state('/test', {
			url: '/test',
			templateUrl : './app/global/test.html',
		})
		.state('/UserBookHistory', {
			url: '/UserBookHistory',
			templateUrl : './app/UserBookHistory/UserBookHistory.html',
			controller  : 'UserBookHistoryController',
		})
		
		.state('/History', {
			url: '/History',
			templateUrl : './app/global/History.html',
			//controller  : 'mainController',
		})
		
		.state('/Science', {
			url: '/Science',
			templateUrl : './app/global/Science.html',
			controller  : 'scienceControllers',
		})
		
		.state('/scienceTest', {
			url: '/scienceTest',
			templateUrl : './app/BookCategory/science.html',
			controller : 'scienceTestController'
		})
		.state('/login', {
			url: '/login',
			templateUrl : './app/global/login.html',
			controller  : 'loginController',
		})
		.state('/HistoryTest', {
			url: '/HistoryTest',
			templateUrl : './app/BookCategory/History.html',
			controller : 'HistoryTestController'
		})
		.state('/SignUp', {
			url: '/SignUp',
			templateUrl : './app/global/SignUp.html',
			controller : 'signUpController'
		})		
		
		.state('/Fantasy', {
			url: '/Fantasy',
			templateUrl : './app/BookCategory/Fantasy.html',
			controller : 'FantasyController',
		})
		
		.state('/Dashboard', {
			url: '/Dashboard',
			templateUrl : './app/global/Dashboard.html',
			controller  : 'dashboardController',
		})
		
		
		
		.state('/Admin_Homepage', {
			url: '/Admin_Homepage',
			templateUrl : './app/Admin/Admin_Homepage.html',
			controller  : 'Admin_Homepage',
		})
		
		.state('/ManageBook', {
			url: '/ManageBook',
			templateUrl : './app/Admin/ManageBook.html',
			controller  : 'ManageBook',
		})
		
		
		.state('/New', {
			url: '/New',
			templateUrl : './app/Admin/New.html',
			controller  : 'New',
		})
		
		$urlRouterProvider.otherwise('/');
	});
}());