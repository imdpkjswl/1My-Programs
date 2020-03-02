main()
{
    int marks;
    printf("ENTER YOUR MARKS");
    scanf("%d",&marks);
    if(marks>90)
    {
        printf("Garde-A");

    }
    else
    {
        if(marks>80)
        {
            printf("Grade-B");

        }
        else
        {
          if(marks>70)
          {
              printf("Grade-C");
          }
          else
          {
              printf("Grade-D");

          }
        }
    }
    getch();
}
