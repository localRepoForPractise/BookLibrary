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
			controller  : 'menucontroller',
		})
		/*.state('/home', {
			url: '/home',
			templateUrl : './app/global/home.html',
			controller_  : 'menucontroller',
		})*/
		.state('/test', {
			url: '/test',
			templateUrl : './app/global/test.html',
		})
		.state('/UserBookHistory', {
			url: '/UserBookHistory',
			templateUrl : './app/UserBookHistory/UserBookHistory.html',
			controller  : 'UserBookHistoryController',
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
			controller : 'HistoryController'
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
		
		.state('/arts', {
			url: '/arts',
			templateUrl : './app/BookCategory/arts.html',
			controller : 'artsController'
		})
		window.onpopstate = function (e) { window.history.forward(1); }
		$urlRouterProvider.otherwise('/');
	});
}());