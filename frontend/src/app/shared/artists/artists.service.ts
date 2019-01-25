import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { ArtistsComponent } from './artists/artists.component';

@Injectable()
export class ArtistsService {

  constructor(private http: HttpClient) { }

  public API = '//localhost:8080';

   getAllArtists() : Observable<any>{
      return this.http.get('//localhost:8080/artists');
    }
    getArtists(artistsID:number) : Observable<any>{
      return this.http.get('//localhost:8080/artists/'+artistsID);
    }
    getAllBand() : Observable<any>{
      return this.http.get('//localhost:8080/Band');
    }

     getManager() : Observable<any>{
      return this.http.get('//localhost:8080/Manager');
    }
     getTypeMusic(): Observable<any>{
      return this.http.get('//localhost:8080/TypeMusic');
    }

    getGender() : Observable<any>{
     return this.http.get('//localhost:8080/Gender');
    }

    getShowArtists(): Observable<any>{
      return this.http.get('//localhost:8080/artists');
    }

}

