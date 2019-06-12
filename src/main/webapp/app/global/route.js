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
			templateUrl : './app/global/UserBookHistory.html',
			//controller  : 'mainController',
		})
		
		.state('/History', {
			url: '/History',
			templateUrl : './app/global/History.html',
			//controller  : 'mainController',
		})
		
		.state('/Science', {
			url: '/Science',
			templateUrl : './app/global/Science.html',
			//controller  : 'mainControllers',,
		})
		$urlRouterProvider.otherwise('/');
	});
}());
