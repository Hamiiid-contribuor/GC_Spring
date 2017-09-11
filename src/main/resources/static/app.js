var app = angular.module('App', [ 'ui.router' ]);

app.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider.state('client', {

		url : '/client',
		templateUrl : 'pages/client/client.html',
		controller : 'ClientController'

	});

	$stateProvider.state('fournisseur', {

		url : '/fournisseur',
		templateUrl : 'pages/fournisseur/fournisseur.html',
		controller : 'FournisseurController'

	});
	
	
	$stateProvider.state('connexion' ,{
		
		url : '/connexion',
		templateUrl : 'pages/connexion/connexion.html',
		controller : 'ConnexionController'
		
	});

});

app.controller('ClientController', function($scope, $http) {

	$scope.client2Persist = {};
	$scope.clients = null;

	$http.get("http://localhost:8080/client/all").then(function(response) {

		$scope.clients = response.data;
		console.log("list success ");
	});

	$scope.reloadClients = function() {
		$http.get("http://localhost:8080/client/all").then(function(response) {

			$scope.clients = response.data;
			console.log("clients reloaded ");
		});
	}

	$scope.addClient = function() {

		$http.post("http://localhost:8080/client/add", $scope.client2Persist)
				.then(function(response) {

					$scope.client2Persist = [];
					$scope.reloadClients();
					console.log("add  Success");
				});

	}

	$scope.searchClients = function() {

		$http.post("http://localhost:8080/client/searchClients",
				$scope.client2Search).then(function(response) {

			// $scope.clients= null ;
			$scope.clients = response.data;
			console.log("j'ai chercher  par  matricule ");

		});

	}

	$scope.deleteClient = function(matricule) {

		$http.get("http://localhost:8080/client/delete/" + matricule).then(
				function(response) {

					console.log("bien supprimer ");
					$scope.reloadClients();

				});
	}

	$scope.editClient = function(client) {

		$http.post("http://localhost:8080/client/edit", $scope.client2Edit)
				.then(function() {

					$scope.client2Edit = {};
					$scope.reloadClients();
					console.log("edition faite avec succes ;)");

				});
	}

	$scope.prepareEditClient = function(client) {

		$scope.client2Edit = client;
	}

});

app.controller('FournisseurController', function($scope, $http) {

});


app.controller('ConnexionController' , function($scope , $http){
	
	
	
	
});
