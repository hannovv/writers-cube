import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { StoryboardComponent } from './components/storyboard/storyboard.component';
import { CreatestoryboardComponent } from './components/createstoryboard/createstoryboard.component';
import { ViewstoryboardsComponent } from './components/viewstoryboards/viewstoryboards.component';
import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    StoryboardComponent,
    CreatestoryboardComponent,
    ViewstoryboardsComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
