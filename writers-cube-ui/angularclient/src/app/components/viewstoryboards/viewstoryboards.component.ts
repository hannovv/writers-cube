import { Storyboard } from 'src/app/models/storyboard';
import { Storyboardservice } from 'src/app/services/storyboard.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewstoryboards',
  templateUrl: './viewstoryboards.component.html',
  styleUrls: ['./viewstoryboards.component.css']
})
export class ViewstoryboardsComponent implements OnInit {



  storyboards: Storyboard[] = [];

  constructor(private router : Router, private storyboardservice : Storyboardservice) {

  }


  selectedStoryBoard !: Storyboard;
  onStoryboardRowSelect(event: { data: { storyboardId: string; }; }): void {
    this.router.navigate(['../storyboard']);

    this.storyboardservice.findStoryBoardById(event.data.storyboardId).subscribe(result => {
      console.log(result); // <-- Object is logged properly.
      this.selectedStoryBoard = result; // Assigning the local @Input variable to the result
    });
  }

  redirect(storyboard : Storyboard) : void{
    this.router.navigate(['/storyboard', storyboard.id]);
  }

  ngOnInit() {
    this.storyboardservice.findAll().subscribe(data => {
      this.storyboards = data;
    });
  }

}
