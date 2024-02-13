import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {

  constructor(private http: HttpClient) {
    console.log('Spotify Service Listo');
  }

  getQuery( query: string ) {

    const url = `https://api.spotify.com/v1/${ query }`;

    const headers = new HttpHeaders({
      'Authorization': 'Bearer BQDniOfsuChcN46cIH10bDR-r4YE4CC75VLfrKZ8yWgN6Nh5YIUeX2gFLXuvTp8LJZ8gSz3D5jVmOBzuS_SEOYBO2sjqU6Fjq49e6jISm4e6UwRLrRWT2_cwG9SLAKYJD4DQaOpG9iugzI0tDgtroWf8r6NWY6ulmRlnIDfeoT0By4P5gGCgk6T6pUHlEyHCVeRqYZ_eMy_6NiPqW1qjDFRmEhy02kAPQQQhpb-UVmBCdV3VQ82f5-TnFpwsxq69nXtX8sis-vdLZyDlww8HVQXd'
    });

    return this.http.get(url, { headers });

  }


  getAlbumTheHives(){
    return this.getQuery('albums/6agQKhrctciHD4QH7KufOS')
            .pipe( map( data => data ));
  }

  getAlbumDojaCat(){
    return this.getQuery('albums/6DmPNcfpkXBVRJsEIJY9tl')
            .pipe( map( data => data ));
  }

  getNewReleases() {
    return this.getQuery('browse/new-releases?limit=20')
              .pipe( map( data => data['albums'].items ));
  }

  getArtistas( termino: string ) {
    return this.getQuery(`search?q=${ termino }&type=artist&limit=15`)
                .pipe( map( data => data['artists'].items));
  }

  getArtista( id: string ) {
    return this.getQuery(`artists/${ id }`);
                // .pipe( map( data => data['artists'].items));
  }

  getTopTracks( id: string ) {
    return this.getQuery(`artists/${ id }/top-tracks?country=us`)
                .pipe( map( data => data['tracks']));
  }

}
