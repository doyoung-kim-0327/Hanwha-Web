ClassicEditor 
    .create( document.querySelector( '#pcontent' ) ) 
    .then( editor => { 
        console.log( editor ); 
    } ) 
    .catch( error => { 
        console.error( error ); 
    } );

