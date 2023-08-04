import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Storyboard } from '../models/storyboard';


@Injectable({
  providedIn: 'root'
})
export class Storyboardservice {

  private storyBoardUrl: string;

  constructor(private http: HttpClient) { 
    this.storyBoardUrl = 'http://localhost:8080/storyboards'
  }

  public findAll(): Observable<Storyboard[]> {
    return this.http.get<Storyboard[]>(this.storyBoardUrl);
  }

  public findStoryBoardById(id : string): Observable<Storyboard> {
    return this.http.get<Storyboard>(this.storyBoardUrl + '/' + id)
  }

  public save(storyboard: Storyboard) {
    return this.http.post<Storyboard>(this.storyBoardUrl, storyboard);
  }

  
}
