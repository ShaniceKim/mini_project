<style type="text/css">
    #containerSnow {
      background: rgb(32,35,116);
background: linear-gradient(0deg, #0E1125 0%, #0A4375 100%);
      margin: 0px;
      overflow: hidden;
    }
  </style>
	
<div id="containerSnow" style='width:100%;height:200px;margin: 10px 0 15px 0;color:white;font-size:7pt;'>
  <div style='position:relative;'>
	  <div style='position:absolute;'>
Open Source by sebleedelisle <br/>
	( https://seblee.me/2010/11/javascript-html5-canvas-snow-in-3d/ ) 
		</div>
	</div>
</div>
	<script type="text/javascript" src="https://tistory3.daumcdn.net/tistory/3165311/skin/images/ThreeCanvas.js"></script>
	<script type="text/javascript" src="https://tistory2.daumcdn.net/tistory/3165311/skin/images/Snow.js"></script>
	
		<script>

			var SCREEN_WIDTH = window.innerWidth;
			var SCREEN_HEIGHT = window.innerHeight;

			var container;

			var particle;

			var camera;
			var scene;
			var renderer;

			var mouseX = 0;
			var mouseY = 0;

			var windowHalfX = window.innerWidth / 2;
			var windowHalfY = window.innerHeight / 2;
			
			var particles = []; 
			var particleImage = new Image();//THREE.ImageUtils.loadTexture( "https://tistory4.daumcdn.net/tistory/3165311/skin/images/ParticleSmoke.png" );
			particleImage.src = 'https://tistory4.daumcdn.net/tistory/3165311/skin/images/ParticleSmoke.png'; 
		
			function init() {
				container = document.getElementById("containerSnow");
				camera = new THREE.PerspectiveCamera( 75, SCREEN_WIDTH / SCREEN_HEIGHT, 1, 10000 );
				camera.position.z = 1000;

				scene = new THREE.Scene();
				scene.add(camera);
					
				renderer = new THREE.CanvasRenderer();
				renderer.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
				var material = new THREE.ParticleBasicMaterial( { map: new THREE.Texture(particleImage) } );
					
				for (var i = 0; i < 500; i++) {

					particle = new Particle3D( material);
					particle.position.x = Math.random() * 2000 - 1000;
					particle.position.y = Math.random() * 2000 - 1000;
					particle.position.z = Math.random() * 2000 - 1000;
					particle.scale.x = particle.scale.y =  1;
					particle.velocity.x = particle.velocity.x/4;
					particle.velocity.y = particle.velocity.y/4;
					particle.velocity.z = particle.velocity.z/4;
					scene.add( particle );
					
					particles.push(particle); 
				}

				container.appendChild( renderer.domElement );

	
				document.addEventListener( 'mousemove', onDocumentMouseMove, false );
				document.addEventListener( 'touchstart', onDocumentTouchStart, false );
				document.addEventListener( 'touchmove', onDocumentTouchMove, false );
				
				setInterval( loop, 1000 / 60 );
				
			}
			
			function onDocumentMouseMove( event ) {

				mouseX = event.clientX - windowHalfX;
				mouseY = event.clientY - windowHalfY;
			}

			function onDocumentTouchStart( event ) {

				if ( event.touches.length == 1 ) {

					event.preventDefault();

					mouseX = event.touches[ 0 ].pageX - windowHalfX;
					mouseY = event.touches[ 0 ].pageY - windowHalfY;
				}
			}

			function onDocumentTouchMove( event ) {

				if ( event.touches.length == 1 ) {

					event.preventDefault();

					mouseX = event.touches[ 0 ].pageX - windowHalfX;
					mouseY = event.touches[ 0 ].pageY - windowHalfY;
				}
			}

			//

			function loop() {

			for(var i = 0; i<particles.length; i++)
				{

					var particle = particles[i]; 
					particle.updatePhysics(); 
	
					with(particle.position)
					{
						if(y<-1000) y+=2000; 
						if(x>1000) x-=2000; 
						else if(x<-1000) x+=2000; 
						if(z>1000) z-=2000; 
						else if(z<-1000) z+=2000; 
					}				
				}
			
				camera.position.x += ( mouseX - camera.position.x ) * 0.05;
				camera.position.y += ( - mouseY - camera.position.y ) * 0.05;
				camera.lookAt(scene.position); 

				renderer.render( scene, camera );				
			}
      
            init();

		</script>